package breeding;

/**
 * モンスタークラス
 */

public class Monster {

    /** 名前 */
    private String name;
    /** 体力 */
    private int hp;
    /** 体力の最大値 */
    private final int MAX_HP = 100;

    /**
     * 名前を取得
     * @return name
     */
     public String getName() {
        return name;
    }

    /**
     * 名前をセット
     * @param name
     */
     public void setName(String name) {
        this.name = name;
    }
    
    /**
     * 体力を取得
     * @return hp
     */
     public int getHp() {
        return hp;
    }
	
    /**
     * 体力をセット
     * @param hp
     */
     public void setHp(int hp) {
        this.hp = hp;
     }
     
     Monster() {
       super();
     }
     
     /**
      * 名前を出力
      */
     public void talk() {
        System.out.println("こんちは！私の名前は、" + this.name + "だよ！");
    }

     /**
      * 歩いた分体力を消費
      * @param minute 歩いた分数
      */
     public void walk(int minute) {
        this.hp -= minute * 2;
        System.out.println(minute + "分散歩したよ！");
        
        if (this.hp <= 50) {
            System.out.println("お腹すいたなぁ、、");
        }
     }

     /**
      * 食べ物を食べて回復
      * @param food 食べ物
      * @return 感謝の言葉
      */
     public String eat(String message) {
        if ("やきにく".equals(message)) {
            this.hp += 100;
            String a = "おおおぉぉ!!!!!" + message + "!!!!! ありがとう!!!!!";
            return a;
        } else {
            this.hp += 10;
            String b = "おぉ," + message + "をくれるの？ ありがとう!";
            return b;
        }
    }

     /**
      * やくそうで回復
      * @param plant やくそう
      */
     public void cure(String plant) {
        if (("やくそう".equals(plant) && 70 <= this.hp) || ("特やくそう".equals(plant))) {
            this.hp = MAX_HP;
            System.out.println("わーい！全回復！");
        } else if ("やくそう".equals(plant) && 20 <= this.hp && this.hp < 70) {
            this.hp += 30;
            System.out.println("全回復ではない！");
        } else if ("やくそう".equals(plant)) {
            this.hp += 30;
            System.out.println("どうも。");
        }
    }
}