package ru.geekbrains.HomeWork_core2.lesson7.network;

public interface ChatMessageService {
    void send(String msg);
    void receive(String msg);
    void connect();
}
