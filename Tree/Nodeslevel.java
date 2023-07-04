package Tree;

//there is given nfinite tree and each level have level+! nodess level starts from 1 find the given node level
//                  1
//              /       \
//             2         3
//          /  /   \     / /  \
//         4  5     6   7 8   9
//      ..........so on

class Nodeslevel {
    public static void main(String[] args) {
        int number = 10;

        int lvl = 1;
        int prev = 1;
        int total = 0;

        while (total < number) {
            int nodes = prev * (lvl + 1);
            prev = nodes;
            total += nodes;
            lvl++;
        }

        System.out.println(lvl);
    }
}