package br.com.gustavo.service;

import br.com.gustavo.entity.User;
import br.com.gustavo.mapper.UserMapper;
import br.com.gustavo.model.request.UserRequest;
import br.com.gustavo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final UserMapper mapper;

    public Mono<User> save(final UserRequest request) {
        return repository.save(mapper.toEntity(request));
    }
}
