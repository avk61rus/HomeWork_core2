package ru.geekbrains.lesson1;

public class RunningWithObstacles {

    private static int distance;
    private static double heightJump;

    public static void main(String[] args) {
        distance = 150;
        heightJump = 1.5;

        Participant[] participants = {
                new Human(500, 1.5),
                new Cat(300, 1.1),
                new Bot(150, 0.7)
        };

        Obstacles[] obstacles = {
                new Obstacles() {
                    @Override
                    public void jump(double heightJump) {
                        System.out.println(1111);
                    }

                    @Override
                    public void run(int distance) {
                        System.out.println(2222);
                    }
                },
//                new jump(double heightJump),

//                new Wall() {
//                     public void jump(double heightJump) {}
//                },
//
//                new Tradmill() {
//                    public void run(int distance) {
//                    }
//                },
        };

        for (Participant participant : participants) {


            for (Obstacles obstacles1 : obstacles) {
                obstacles1.run(distance);
                obstacles1.jump(heightJump);
            }
        }

//        Tradmill[] tradmills;
//        for (Tradmill tradmill : tradmills) {
//            tradmill.run(distance);
//        }
//
//        Wall[] walls;
//        for (Wall wall : walls) {
//            wall.jump(heightJump);
//
//        }

    }
    public static int getDistance() {
        return distance;
    }

    public static double getHeightJump() {
        return heightJump;
    }

}
