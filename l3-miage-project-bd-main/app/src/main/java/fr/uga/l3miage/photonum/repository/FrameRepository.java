package fr.uga.l3miage.photonum.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import fr.uga.l3miage.photonum.domain.model.Frame;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class FrameRepository implements CRUDRepository<Long, Frame> {

    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public Frame  save(Frame frame) {
        entityManager.persist(frame);
        return frame;
    }
    @Override
    public Frame get(Long id) {
        return entityManager.find(Frame.class, id);
    }
    @Override
    public void delete(Frame frame) {
        entityManager.remove(frame);
    }
    @Override
    public List<Frame> all() {
        return null;
    }

    public List<Frame> findAll(){
        return entityManager.createQuery("from Frame").getResultList();
    }

    public Frame update(Frame frame){
        return entityManager.merge(frame);
    } 
    
}
