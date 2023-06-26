package StackandQueue;

class CreateStack extends Stack {
    public static void main(String[] args) {
        Stack first = new Stack();
        int l;

        do {

            System.out.println("enter 1 to push , 2 to pop the items , 3 to display the stacked items");
            System.out.println("Enter the choice");

            int d = first.sc.nextInt();

            switch (d) {
                case 1:
                    first.push();
                    break;
                case 2:
                    first.pop();
                    break;
                case 3:
                    first.display();
                    break;
            }

            System.out.print("enter 0  to continue or enter any number to discontinue");
            l = first.sc.nextInt();

        } while (l == 0);

        System.out.println("Exit Succesfully");
    }
}