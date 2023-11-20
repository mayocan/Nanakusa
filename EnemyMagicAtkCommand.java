public class EnemyMagicAtkCommand extends Command{
    int enemyAtk;
    int heroAtk;
    int heroDef;
    int enemyMp;
    int magicNum;
    int mpCost;
    int heroDmg;
    String result;
    public EnemyMagicAtkCommand(int commandNum, int enemyAtk,int heroDef, int heroAtk, int enemyMp,int mpCost ,int magicNum){
        super(commandNum);
        this.enemyAtk = enemyAtk;
        this.heroDef = heroDef;
        this.heroAtk = heroAtk;
        this.enemyMp = enemyMp;
        this.atkNum = magicNum;
        if (enemyMp > mpCost){
            this.heroDmg = (( heroAtk - enemyAtk ) * magicNum) * ( heroDef/500 );
            this.result = " ";
        }else{
            this.result = "Enemy's MP is not enough!";
        }
        
    }
}