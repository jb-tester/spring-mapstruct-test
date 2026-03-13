package com.mytests.spring.springmapstructtest.mappers;

import com.mytests.spring.springmapstructtest.model.Issue;
import com.mytests.spring.springmapstructtest.model.IssueView;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
implementationName = "IssueMapperGenerated")
public interface IssueMapper
{
    IssueView issueViewFromEntity(Issue issue);
    Issue issueFromView(IssueView issueView);
}
