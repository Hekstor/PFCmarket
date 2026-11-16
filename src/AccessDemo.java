public class AccessDemo {
    private void methodClassLevel() {
        //System.out.println("private: виден только внутри этого класса");
    }

    protected void methodProtectedLevel() {
        //System.out.println("protected: пакет + наследники");
    }

    void methodPackageLevel() {
        //System.out.println("package-private: только этот пакет");
    }

    public void methodPublicLevel() {
        //System.out.println("public: виден везде");
    }

    // Все четыре метода можно вызвать внутри самого класса — тут нет ограничений
    public void callAll() {
        methodClassLevel();
        methodProtectedLevel();
        methodPackageLevel();
        methodPublicLevel();
    }
}
