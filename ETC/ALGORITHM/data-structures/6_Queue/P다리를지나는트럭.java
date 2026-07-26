import java.util.*;

class P다리를지나는트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<Integer>();
        Queue<Integer> trucks = new LinkedList<Integer>();
        int time = 0;
        int bridge_weight = 0;

        for (int i = 0; i < bridge_length; i++) {
            bridge.add(0);
        }

        for (int t : truck_weights) {
            trucks.add(t);
        }


        while (bridge.size() != 0) {
            time++;

            int out = bridge.poll();
            bridge_weight -= out;

            if (trucks.size() != 0) {
                if (bridge_weight + trucks.peek() <= weight) {
                    int now_truck = trucks.poll();
                    bridge.add(now_truck);
                    bridge_weight += now_truck;

                } else {
                    bridge.add(0);
                }
            }
        }


        return time;
    }
}
