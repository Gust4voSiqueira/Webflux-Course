package br.com.gustavo.model.request;

public record UserResponse(
        String id,
        String email,
        String name,
        String pasword
) {
}
