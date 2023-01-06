package com.company;

public interface IEntityRepository<T extends IEntity> {//T nesnesinin varlık sınıfından inherit edilmesi gerekir.
                                                        // Bu sayede sadece varlık nesneleri verilebilir.
    void add(T entity);
    void remove(T entity);
    void update(T entity);

}
