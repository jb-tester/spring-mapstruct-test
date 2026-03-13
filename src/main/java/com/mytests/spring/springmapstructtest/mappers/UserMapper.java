package com.mytests.spring.springmapstructtest.mappers;


import com.mytests.spring.springmapstructtest.model.User;
import com.mytests.spring.springmapstructtest.model.UserView;
import org.mapstruct.Builder;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(builder = @Builder(disableBuilder = true),
        componentModel = MappingConstants.ComponentModel.SPRING,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR
)
public interface UserMapper {
    User toUser(UserView dto);
    UserView toDto(User user);
}
