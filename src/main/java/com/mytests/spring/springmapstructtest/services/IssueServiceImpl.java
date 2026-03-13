package com.mytests.spring.springmapstructtest.services;

import com.mytests.spring.springmapstructtest.mappers.IssueMapper;
import com.mytests.spring.springmapstructtest.model.Issue;
import com.mytests.spring.springmapstructtest.model.IssueView;
import org.springframework.stereotype.Service;

@Service
public class IssueServiceImpl implements IssueService {
    private final IssueMapper issueMapper;

    public IssueServiceImpl(IssueMapper issueMapper) {
        this.issueMapper = issueMapper;
    }

    @Override
    public IssueView createView(Issue issue) {
        var view = issueMapper.issueViewFromEntity(issue);
        return view;
    }

    @Override
    public Issue createIssue(IssueView issueView) {
        return issueMapper.issueFromView(issueView);
    }
}
