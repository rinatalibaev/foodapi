package ru.alibaev.foodapi.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.alibaev.foodapi.model.domain.Recipe;
import ru.alibaev.foodapi.model.dto.request.RecipeRequest;
import ru.alibaev.foodapi.model.dto.response.RecipeListResponse;
import ru.alibaev.foodapi.model.dto.response.RecipeResponse;
import ru.alibaev.foodapi.model.entity.RecipeEntity;

import java.util.List;

@Mapper(uses = {UserMapper.class, ImageMapper.class, StepMapper.class, RecipeIngredientMapper.class, CommentMapper.class})
public interface RecipeMapper {

    Recipe toDomain(RecipeEntity entity);

    RecipeEntity toEntity(Recipe domain);

    List<Recipe> toDomainList(List<RecipeEntity> entities);
    List<RecipeEntity> toEntityList(List<Recipe> domains);

    RecipeListResponse toListResponse(Recipe recipe);
    RecipeResponse toResponse(Recipe recipe);

    @Mapping(target = "author", ignore = true) // author задаётся в сервисе по uuid
    Recipe toDomain(RecipeRequest request);
}

