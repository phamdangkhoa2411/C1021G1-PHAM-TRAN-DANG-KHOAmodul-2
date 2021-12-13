package bai_tap_them.bai_tap_1.service;
import bai_tap_them.bai_tap_1.model.Candidate;

public interface CandidateService {

    void add(Candidate candidate);

    Candidate[] findAll();
}

