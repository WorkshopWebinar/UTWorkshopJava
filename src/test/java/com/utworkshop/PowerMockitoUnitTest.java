package com.utworkshop;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.powermock.api.mockito.PowerMockito.mock;
import static org.powermock.api.mockito.PowerMockito.verifyNew;
import static org.powermock.api.mockito.PowerMockito.when;
import static org.powermock.api.mockito.PowerMockito.whenNew;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames = "com.utworkshop.*")
public class PowerMockitoUnitTest {

    @Test
    public void givenFinalMethods_whenUsingPowerMockito_thenCorrect() throws Exception {
        CollaboratorWithFinalMethods mock = mock(CollaboratorWithFinalMethods.class);
        whenNew(CollaboratorWithFinalMethods.class).withNoArguments().thenReturn(mock);

        CollaboratorWithFinalMethods collaborator = new CollaboratorWithFinalMethods();
        verifyNew(CollaboratorWithFinalMethods.class).withNoArguments();

        when(collaborator.helloMethod()).thenReturn("Hello GET Team!");
        String welcome = collaborator.helloMethod();
        verify(collaborator).helloMethod();
        assertEquals("Hello GET Team!", welcome);
    }

}