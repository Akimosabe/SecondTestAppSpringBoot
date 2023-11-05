package ru.example2.SecondTestAppSpringBoot.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.example2.SecondTestAppSpringBoot.Model.Request;

@Service
@Primary

public class ModifySourceRequestService implements ModifyRequestService {

    @Override
    public void modify(Request request) {
        request.setSource("Source: ");

    }
}