# Exercício: Instrumentos Musicais

Desenvolva classes para instrumentos musicais com
método abstrato *tocar()* e crie uma classe Orquestra
para apresentá-los.

> Dicas para resolução:
> - Use classes abstratas para definir comportamentos comuns
> - Implemente métodos específicos nas subclasses
> - Utilize arrays de superclasses para demonstrar polimorfismo
> - Teste com diferentes tipos de objetos

Classe abstrata *InstrumentoMusical* com:

- Método abstrato tocar()
- Método concreto afinar()

```java
@Override
public void tocar() {
    System.out.println("Tocando melodia no piano...");
}
```

> Dicas para Implementação:
> - Use a anotação @Override para garantir a correta sobrescrita
> - Implemente todos os métodos abstratos nas subclasses
> - Teste o polimorfismo com arrays do tipo da superclasse
> - Verifique se cada objeto responde conforme sua implementação específica
