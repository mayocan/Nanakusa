public class EnemyAtkCommand extends Command{
    int enemyAtk;
    int heroAtk;
    int heroDef;
    int atkNum;
    int heroDmg;
    public EnemyAtkCommand(int commandNum, int enemyAtk,int heroDef, int heroAtk,int atkNum){
        super(commandNum);
        this.enemyAtk = enemyAtk;
        this.heroDef = heroDef;
        this.heroAtk = heroAtk;
        this.atkNum = atkNum;
        this.heroDmg = (( heroAtk - enemyAtk ) * atkNum) * ( heroDef/1000 );
    }
}