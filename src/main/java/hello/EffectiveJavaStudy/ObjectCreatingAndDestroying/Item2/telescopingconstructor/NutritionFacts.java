package hello.EffectiveJavaStudy.ObjectCreatingAndDestroying.Item2.telescopingconstructor;

/**
 * 점층적 생성자 패턴 - 필수 매개변수와 선택 매개변수의 경우의 수 마다 생성자 생성
 * 단점 : 매개변수 개수가 많아지면 가독성이 떨어진다.
 *     : 사용자가 설정하길 원치 않는 매개변수도 포함되는 경우가 생긴다. (매개변수 순서만 바뀌어도 혼란발생)
 */
public class NutritionFacts {

    private final int servingSize; // (ml, 1회 제공량) 필수
    private final int servings; // (회, 총 n회 제공량) 필수
    private final int calories; // (1회 제공량당 칼로리) 선택
    private final int fat; // (g, 1회 제공량당 지방) 선택
    private final int sodium; // (mg/ 1회 제공량당 나트륨) 선택
    private final int carbohydrate; // (g, 1회 제공량 당 탄수화물) 선택


    // 필수매개변수만 포함한 생성자
    public NutritionFacts(int servingSize, int servings) {
        this(servingSize, servings, 0); // 기본 칼로리 값을 0으로 설정
    }

    // 필수 + 선택1 (칼로리)
    public NutritionFacts(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0);
    }

    // 필수 + 선택2 (칼로리, 지방)
    public NutritionFacts(int servingSize, int servings, int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }


    // 필수 + 선택3 (칼로리, 지방, 나트륨)
    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }


    // 필수 + 선택4 (칼로리, 지방, 나트륨, 탄수화물) 가독성이 떨어진다.
    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }
}
