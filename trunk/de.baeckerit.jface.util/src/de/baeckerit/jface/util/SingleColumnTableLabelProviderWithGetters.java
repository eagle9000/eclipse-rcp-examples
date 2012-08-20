package de.baeckerit.jface.util;

import org.eclipse.swt.graphics.Image;

import de.baeckerit.jdk.util.IGetter;

public class SingleColumnTableLabelProviderWithGetters<T> extends SingleColumnTableLabelProvider {

    private final IGetter<String, T> labelGetter;
    private final IGetter<Image, T> imageGetter;

    public SingleColumnTableLabelProviderWithGetters(IGetter<String, T> labelGetter) {
        this.labelGetter = labelGetter;
        this.imageGetter = null;
    }

    public SingleColumnTableLabelProviderWithGetters(IGetter<String, T> labelGetter, IGetter<Image, T> imageGetter) {
        this.labelGetter = labelGetter;
        this.imageGetter = imageGetter;
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public String getText(Object element) {
        return labelGetter.get((T)element);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public Image getImage(Object element) {
        return imageGetter == null ? null : imageGetter.get((T)element);
    }
}