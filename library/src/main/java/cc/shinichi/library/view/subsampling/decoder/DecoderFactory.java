package cc.shinichi.library.view.subsampling.decoder;

import androidx.annotation.NonNull;

import cc.shinichi.library.view.subsampling.decoder.ImageDecoder;
import cc.shinichi.library.view.subsampling.decoder.ImageRegionDecoder;

import java.lang.reflect.InvocationTargetException;

/**
 * Interface for {@link ImageDecoder} and {@link ImageRegionDecoder} factories.
 * @param <T> the class of decoder that will be produced.
 */
public interface DecoderFactory<T> {

    /**
     * Produce a new instance of a decoder with type {@link T}.
     * @return a new instance of your decoder.
     * @throws IllegalAccessException if the factory class cannot be instantiated.
     * @throws InstantiationException if the factory class cannot be instantiated.
     * @throws NoSuchMethodException if the factory class cannot be instantiated.
     * @throws InvocationTargetException if the factory class cannot be instantiated.
     */
    @NonNull T make() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException;

}
