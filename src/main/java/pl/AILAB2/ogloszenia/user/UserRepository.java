package pl.AILAB2.ogloszenia.user;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
    User findByLoginAndPassword(String login, String password);
}
