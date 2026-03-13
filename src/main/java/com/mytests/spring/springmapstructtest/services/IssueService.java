package com.mytests.spring.springmapstructtest.services;


import com.mytests.spring.springmapstructtest.model.Issue;
import com.mytests.spring.springmapstructtest.model.IssueView;

public interface IssueService {
    IssueView createView(Issue issue);
    Issue createIssue(IssueView issueView);
}
