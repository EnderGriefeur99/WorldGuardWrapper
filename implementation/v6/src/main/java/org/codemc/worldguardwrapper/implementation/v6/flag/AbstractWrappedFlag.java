package org.codemc.worldguardwrapper.implementation.v6.flag;

import com.sk89q.worldguard.protection.flags.Flag;
import org.codemc.worldguardwrapper.flag.IWrappedFlag;

import java.util.Optional;

public abstract class AbstractWrappedFlag<T> implements IWrappedFlag<T> {

    private final Flag<?> handle;

    public AbstractWrappedFlag(Flag<?> handle) {
        this.handle = handle;
    }

    @Override
    public String getName() {
        return handle.getName();
    }

    public abstract Optional<T> fromWGValue(Object value);

    public abstract Optional<Object> fromWrapperValue(T value);

    @Override
    public Optional<T> getDefaultValue() {
        return fromWGValue(handle.getDefault());
    }

    public Flag<?> getHandle() {
        return handle;
    }

}
