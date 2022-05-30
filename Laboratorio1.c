//
#include <stdio.h>
#include <stdlib.h>

#define COEFICIENTE 2
#define KB 1024
#define MULTI 200

int main()
{
    int conta, *intPtr;
    long int i, j, dime = COEFICIENTE * KB;
	
    if ((intPtr = malloc(dime * dime * sizeof(int))) == 0) {
    perror ("totally out of space");
    exit (1);
    }
    
    for (conta=1; conta<=MULTI; conta++)
        for (i=0; i<dime; i++)
            for (j=0; j<dime; j++)
                 intPtr[i*dime + j] = (i + j) % conta;
                 
    free (intPtr);
    return 0;
}
