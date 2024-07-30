package br.com.cti.firstproject.service;

public interface IConverteDados {
    <T>T obterDados(String json, Class<T> classe);
}
