import java.util.Arrays;

public class GasStation {
    // Suppose there is a circle. There are N petrol pumps on that circle. You will
    // be given two sets of data.
    // 1. The amount of petrol that every petrol pump has.
    // 2. Distance from that petrol pump to the next petrol pump.
    // Find a starting point where the truck can start to get through the complete
    // circle without exhausting its petrol in between.
    // Note : Assume for 1 litre petrol, the truck can go 1 unit of distance.
    // N = 4
    // Petrol = 4 6 7 4
    // Distance = 6 5 3 5
    // Output: 1
    // Explanation: There are 4 petrol pumps with
    // amount of petrol and distance to next
    // petrol pump value pairs as {4, 6}, {6, 5},
    // {7, 3} and {4, 5}. The first point from
    // where truck can make a circular tour is
    // 2nd petrol pump. Output in this case is 1
    // (index of 2nd petrol pump).

    // leetcode problem statement

    // There are n gas stations along a circular route, where the amount of gas at
    // the ith station is gas[i].

    // You have a car with an unlimited gas tank and it costs cost[i] of gas to
    // travel from the ith station to its next (i + 1)th station. You begin the
    // journey with an empty tank at one of the gas stations.

    // Given two integer arrays gas and cost, return the starting gas station's
    // index if you can travel around the circuit once in the clockwise direction,
    // otherwise return -1. If there exists a solution, it is guaranteed to be
    // unique

    // Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
    // Output: 3
    // Explanation:
    // Start at station 3 (index 3) and fill up with 4 unit of gas. Your tank = 0 +
    // 4 = 4
    // Travel to station 4. Your tank = 4 - 1 + 5 = 8
    // Travel to station 0. Your tank = 8 - 2 + 1 = 7
    // Travel to station 1. Your tank = 7 - 3 + 2 = 6
    // Travel to station 2. Your tank = 6 - 4 + 3 = 5
    // Travel to station 3. The cost is 5. Your gas is just enough to travel back to
    // station 3.
    // Therefore, return 3 as the starting index.
    // Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
    // Output: 3
    // Explanation:
    // Start at station 3 (index 3) and fill up with 4 unit of gas. Your tank = 0 +
    // 4 = 4
    // Travel to station 4. Your tank = 4 - 1 + 5 = 8
    // Travel to station 0. Your tank = 8 - 2 + 1 = 7
    // Travel to station 1. Your tank = 7 - 3 + 2 = 6
    // Travel to station 2. Your tank = 6 - 4 + 3 = 5
    // Travel to station 3. The cost is 5. Your gas is just enough to travel back to
    // station 3.
    // Therefore, return 3 as the starting index.
    public static void main(String[] args) {
        int[] gas = { 1, 2, 3, 4, 5 };
        int[] cost = { 3, 4, 5, 1, 2 };

        int gasmax = 0;
        int costmax = 0;

        for (int i = 0; i < gas.length; i++) {
            gasmax += gas[i];
            costmax += cost[i];
        }

        if (gasmax < costmax)
            System.out.println("-1");

        int gast = 0;
        int index = 0;
        for (int i = 0; i < gas.length; i++) {

            gast += (gas[i] - cost[i]);
            if (gast < 0) {
                gast = 0;
                index = i + 1;
            }

        }
        System.out.println(index);

    }
}
