package br.com.gustavo.model.request;

public record UserRequest(
        String name,
        String email,
        String password) {
}
