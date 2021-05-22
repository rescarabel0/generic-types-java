package br.org.genericTypes;

import java.time.LocalDate;

public class Client {
    
    private String CPF;
    private String name;
    private String phone;
    private LocalDate birthDate;

    public Client(String CPF, String name, String phone, LocalDate birthDate){
        this.CPF = CPF;
        this.name = name;
        this.phone = phone;
        this.birthDate = birthDate;
    }

    public String getCPF() {
        return CPF;
    }

    public String getName() {
        return name;
    }

    public String getPhone() { return phone; }

    public LocalDate getBirthDate() { return birthDate; }
}
