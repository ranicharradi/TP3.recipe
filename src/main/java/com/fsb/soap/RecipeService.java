package com.fsb.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface RecipeService {
    @WebMethod
    void addRecipe(Recipe recipe);

    @WebMethod
    Recipe getRecipe(int id);

    @WebMethod
    List<Recipe> getAllRecipes();
}