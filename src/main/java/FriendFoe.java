public class FriendFoe {

    public static void main(String[] args) {
        friendFoeLoop();
    }

    static void friendFoeLoop() {
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0) {
                friendFoeNewLine(i);
            } else {
                friendFoe(i);
            }
        }
    }

    static void friendFoe(int i) {
        if (i % 4 == 0 && i % 7 == 0) {
            System.out.print("FriendFoe,");
        } else if (i % 4 == 0) {
            System.out.print("Friend,");
        } else if (i % 7 == 0) {
            System.out.print("Foe,");
        } else {
            System.out.print(i + ",");
        }
    }

    static void friendFoeNewLine(int i) {
        if (i % 4 == 0 && i % 7 == 0) {
            System.out.println("FriendFoe");
        } else if (i % 4 == 0) {
            System.out.println("Friend");
        } else if (i % 7 == 0) {
            System.out.println("Foe");
        } else {
            System.out.println(i);
        }
    }

}
