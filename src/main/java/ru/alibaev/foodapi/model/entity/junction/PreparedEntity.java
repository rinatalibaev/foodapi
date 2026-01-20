package ru.alibaev.foodapi.model.entity.junction;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import ru.alibaev.foodapi.model.entity.AppUserEntity;
import ru.alibaev.foodapi.model.entity.RecipeEntity;
import ru.alibaev.foodapi.model.entity.base.BaseIdEntity;

@Entity
@Table(name = "prepared")
@Getter
@Setter
public class PreparedEntity extends BaseIdEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private AppUserEntity user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recipe_id", nullable = false)
    private RecipeEntity recipe;

    private int preparedCount;

}

