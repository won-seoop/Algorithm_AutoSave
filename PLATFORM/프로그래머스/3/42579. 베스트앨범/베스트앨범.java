import java.util.*;


class Solution {
    
    
    public List<Integer> solution(String[] genres, int[] plays) {
        HashMap<String, Integer> total_play_info = new HashMap<>();
        HashMap<String, HashMap<Integer, Integer>> musics=new HashMap<>();
        List<Integer> answer = new ArrayList<>();
        
        
        for (int i=0; i<genres.length; i++){
            String genre = genres[i];
            int id = i;
            int play_cnt = plays[i];
            
            total_play_info.put(genre, total_play_info.getOrDefault(genre,0)+plays[i]);
            HashMap<Integer, Integer> music =musics.getOrDefault(genre, new HashMap<>());
            music.put(id, play_cnt);
            musics.put(genre, music);
        }
        
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(total_play_info.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>(){
            @Override
            public int compare(Map.Entry<String,Integer> entry1, Map.Entry<String,Integer> entry2){
                return entry2.getValue()- entry1.getValue();
            }
        });
        
        for (var entry : entryList){
            var _musics = musics.get(entry.getKey());       //hashmap
            
            List<Map.Entry<Integer, Integer>> list = new ArrayList<>(_musics.entrySet());
            
            Collections.sort(list,new Comparator<Map.Entry<Integer, Integer>>(){
                @Override
                public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b){
                    return b.getValue()-a.getValue();
                }
            });
            
            if(list.size()>=2){
                for (int i=0;i<2;i++){
                answer.add(list.get(i).getKey());
                    
                }
            }
            else{
                answer.add(list.get(0).getKey());
            }
        
            
        }
        
        
        
        
        // System.out.println(musics);
        
        
        
        
        
        
        return answer;
    }
}