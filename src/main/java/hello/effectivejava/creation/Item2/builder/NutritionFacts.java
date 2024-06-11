package hello.effectivejava.creation.Item2.builder;

/**
 * 빌더패턴 - 점층적 생성자 패턴의 안전성과 자바빈즈의 가독성
 * 매개변수가 많다면 빌더패턴을 고려하자
 */
public class NutritionFacts {
    private final int servingSize; // (ml, 1회 제공량) 필수
    private final int servings; // (회, 총 n회 제공량) 필수
    private final int calories; // (1회 제공량당 칼로리) 선택
    private final int fat; // (g, 1회 제공량당 지방) 선택
    private final int sodium; // (mg/ 1회 제공량당 나트륨) 선택
    private final int carbohydrate; // (g, 1회 제공량 당 탄수화물) 선택

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    public static NutritionFactsBuilder builder() {
        return new NutritionFactsBuilder();
    }

    public static class NutritionFactsBuilder {
        private int servingSize;
        private int servings;
        private int calories;
        private int fat;
        private int sodium;
        private int carbohydrate;

        NutritionFactsBuilder() {
        }

        public NutritionFactsBuilder servingSize(int servingSize) {
            this.servingSize = servingSize;
            return this;
        }

        public NutritionFactsBuilder servings(int servings) {
            this.servings = servings;
            return this;
        }

        public NutritionFactsBuilder calories(int calories) {
            this.calories = calories;
            return this;
        }

        public NutritionFactsBuilder fat(int fat) {
            this.fat = fat;
            return this;
        }

        public NutritionFactsBuilder sodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public NutritionFactsBuilder carbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this.servingSize, this.servings, this.calories, this.fat, this.sodium, this.carbohydrate);
        }
    }
}
