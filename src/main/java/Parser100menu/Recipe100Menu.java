package Parser100menu;

import java.util.Arrays;

public class Recipe100Menu {
    public String name;
    public String category;
    public String img;
    public int cooking_time;

    public Ingredient100Menu[] ingredients;
    public RecipeStep100Menu[] recipe_steps;

    public Recipe100Menu(String name, String category, String img, int cooking_time,
                         Ingredient100Menu[] ingredients, RecipeStep100Menu[] recipe_steps){
        this.name = name;
        this.category = category;
        this.img = img;
        this.cooking_time = cooking_time;
        this.ingredients = ingredients;
        this.recipe_steps = recipe_steps;
    }
    @Override
    public String toString() {
        return "Recipe100Menu {" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", img='" + img + '\'' +
                ", cooking_time=" + cooking_time +
                ", ingredients=" + Arrays.toString(ingredients) +
                ", recipe_steps=" + Arrays.toString(recipe_steps) +
                '}';
    }

}

