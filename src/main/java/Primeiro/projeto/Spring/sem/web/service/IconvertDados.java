package Primeiro.projeto.Spring.sem.web.service;

public interface IconvertDados {
  <T> T  obterDados(String json, Class<T> classe);
}
