package ru.geekbrains.lesson1;

class Bot implements Tradmill, Wall, Participant, Obstacles {

    public int distanceBot;
    public double heightJumpBot;

    public Bot(int distanceBot, double heightJumpBot) {
        this.distanceBot = distanceBot;
        this.heightJumpBot = heightJumpBot;
    }

    @Override
    public void run(int distanceBot) {
        System.out.println("Робот прошел дистанцию " + RunningWithObstacles.getDistance()  + " метров");
    }

    @Override
    public void jump(double height) {
        System.out.println("Робот перепрыгнул стену высотой " + RunningWithObstacles.getHeightJump() + " метра" );
    }
}