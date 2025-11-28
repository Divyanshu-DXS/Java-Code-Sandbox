package com.api_communication.APIClients.Http_Clients.repository;

import com.api_communication.APIClients.Http_Clients.model.GitHubRepos;
import com.api_communication.APIClients.Http_Clients.model.GithubUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GithubUserRepository extends JpaRepository<GithubUsers,Long> {

    GithubUsers findByLogin(String name);
}
