package dem.crud2.democrud2.service.mapping;

public interface IMapping<E,D> {
    D toDTO(E t);
    E toEntity(D t);
}
