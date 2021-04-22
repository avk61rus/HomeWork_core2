package ru.geekbrains.lesson1;

class Human implements Tradmill, Wall, Participant, Obstacles {

    public int distanceHuman;
    public double heightJumpHuman;

    public Human(int distanceHuman, double heightJumpHuman) {
        this.distanceHuman = distanceHuman;
        this.heightJumpHuman = heightJumpHuman;
    }

@Override
    public void run(int distanceHuman) {
        System.out.println("Человек пробежал дистанцию " + RunningWithObstacles.getDistance()  + " метров");
    }

  @Override
    public void jump(double height) {
        System.out.println("Человек перепрыгнул стену высотой " + RunningWithObstacles.getHeightJump() + " метра" );
    }
}
