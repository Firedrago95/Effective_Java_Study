package hello.effectivejava.creation.Item2.javabeens;

/**
 * 자바빈즈 패턴 - 객체가 완전히 생성되기전에는 일관성이 무너진 상태에 놓인다.
 * 불변객체를 만들수 없다.
 */
public class NutritionFacts {

    // final 사용불가, setter로 설정해야 하기때문
    private int servingSize = -1; // (ml, 1회 제공량) 필수; 기본값 없음
    private int servings = -1; // (회, 총 n회 제공량) 필수; 기본값 없음
    private int calories = 0; // (1회 제공량당 칼로리) 선택; 기본값
    private int fat = 0; // (g, 1회 제공량당 지방) 선택
    private int sodium = 0; // (mg/ 1회 제공량당 나트륨) 선택
    private int carbohydrate = 0; // (g, 1회 제공량 당 탄수화물) 선택

    public NutritionFacts() {}

    // setter 메서드로
    public void setServingSize(int servingSize) {this.servingSize = servingSize;}
    public void setServings(int servings) {this.servings = servings;}
    public void setCalories(int calories) {this.calories = calories;}
    public void setFat(int fat) {this.fat = fat;}
    public void setSodium(int sodium) {this.sodium = sodium;}
    public void setCarbohydrate(int carbohydrate) {this.carbohydrate = carbohydrate;}

    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts();
        nutritionFacts.setServingSize(240);
        nutritionFacts.setServings(8);
        nutritionFacts.setCalories(100);
        nutritionFacts.setSodium(35);
        nutritionFacts.setCarbohydrate(27);
    }
}

