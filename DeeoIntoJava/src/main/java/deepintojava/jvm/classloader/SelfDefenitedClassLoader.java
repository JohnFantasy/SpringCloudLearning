package deepintojava.jvm.classloader;

public class SelfDefenitedClassLoader extends ClassLoader {

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
//        return new Class();
        return null;
    }
}
