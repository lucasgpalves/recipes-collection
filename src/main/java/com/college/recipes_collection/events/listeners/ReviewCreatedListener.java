package com.college.recipes_collection.events.listeners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.college.recipes_collection.events.models.ReviewCreatedEvent;
import com.college.recipes_collection.services.RecipeService;

@Component
public class ReviewCreatedListener {

    @Autowired
    private RecipeService recipeService;
    
    @EventListener
    public void handleReviewCreatedEvent(ReviewCreatedEvent event) {
        recipeService.updateIsRatingStatus(event.getRecipeId(), true);
    }
}
