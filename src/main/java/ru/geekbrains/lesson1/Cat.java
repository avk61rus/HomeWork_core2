package ru.geekbrains.lesson1;

class Cat implements Tradmill, Wall, Participant, Obstacles {

        public int distanceCat;
        public double heightJumpCat;

        public Cat(int distanceCat, double heightJumpCat) {
            this.distanceCat = distanceCat;
            this.heightJumpCat = heightJumpCat;
        }

        @Override
        public void run(int distanceCat) {
            System.out.println("Кот пробежал дистанцию " + RunningWithObstacles.getDistance()  + " метров");
        }

        @Override
        public void jump(double height) {
            System.out.println("Кот перепрыгнул стену высотой " + RunningWithObstacles.getHeightJump() + " метра" );
        }
}
