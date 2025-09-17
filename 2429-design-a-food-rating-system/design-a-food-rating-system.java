

class FoodRatings {
    // maps
    private Map<String, String> foodToCuisine;
    private Map<String, Integer> foodToRating;
    private Map<String, PriorityQueue<Food>> cuisineToFoods;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodToCuisine = new HashMap<>();
        foodToRating = new HashMap<>();
        cuisineToFoods = new HashMap<>();

        for (int i = 0; i < foods.length; i++) {
            String food = foods[i];
            String cuisine = cuisines[i];
            int rating = ratings[i];

            foodToCuisine.put(food, cuisine);
            foodToRating.put(food, rating);

            cuisineToFoods.putIfAbsent(cuisine, new PriorityQueue<>(
                (a, b) -> a.rating != b.rating ? b.rating - a.rating : a.name.compareTo(b.name)
            ));

            cuisineToFoods.get(cuisine).add(new Food(food, rating));
        }
    }

    public void changeRating(String food, int newRating) {
        foodToRating.put(food, newRating);
        String cuisine = foodToCuisine.get(food);
        cuisineToFoods.get(cuisine).add(new Food(food, newRating));
    }

    public String highestRated(String cuisine) {
        PriorityQueue<Food> pq = cuisineToFoods.get(cuisine);

        while (!pq.isEmpty()) {
            Food top = pq.peek();
            // check if rating is still valid
            if (foodToRating.get(top.name) == top.rating) {
                return top.name;
            }
            pq.poll(); // remove outdated entry
        }
        return null;
    }

    // helper class for food
    private static class Food {
        String name;
        int rating;
        Food(String n, int r) {
            name = n;
            rating = r;
        }
    }
}
