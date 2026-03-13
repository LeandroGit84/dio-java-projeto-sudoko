package br.com.dio.service;

public interface EventListener {
    default void update(final EventEnum eventType) {
    }
}
