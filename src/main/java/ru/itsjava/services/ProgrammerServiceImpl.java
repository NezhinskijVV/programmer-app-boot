package ru.itsjava.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service("programmerService")
@RequiredArgsConstructor
public class ProgrammerServiceImpl implements ProgrammerService{
    private final NotebookService notebookService;
    private final IOService ioService;

    @Override
    public void hiToNewProgrammer() {
        System.out.println("Enter your name: ");
        String name = ioService.input();
        System.out.println("Hello " + name);
        System.out.println("Your computer: " + notebookService.getNotebook());
    }
}
