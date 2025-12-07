package ex06.game;

abstract public class Protoss {
    private int hp;
    private int attack;

    abstract public int getAttack();

    abstract public void setAttack(int attack);

    abstract public int getHp();

    abstract public void setHp(int hp);
}
