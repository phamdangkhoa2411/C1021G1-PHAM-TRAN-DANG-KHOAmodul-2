package bai_tap_them.bai_tap_1.service.impl;

import bai_tap_them.bai_tap_1.model.Candidate;
import bai_tap_them.bai_tap_1.service.CandidateService;

public class CandidateServiceImpl implements CandidateService {
    private static Candidate[] candidateList = new Candidate[1];
    static {
        candidateList[0] = new Candidate(1,"Khoa","24/11/2003",7.8,9.0,10.0);
    }

    @Override
    public void add(Candidate candidate) {
        Candidate[] newList = new Candidate[candidateList.length + 1];
        newList[newList.length - 1] = candidate;
        for(int index = 0; index < candidateList.length; index++){
            newList[index] = candidateList[index];
        }
        candidateList = newList;
    }

    @Override
    public Candidate[] findAll() {
        return candidateList;
    }

}