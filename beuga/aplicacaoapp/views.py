from django.shortcuts import render

# Create your views here.
def index(request):
    return render(request, 'index.html')

def outra(request):
    return render(request, 'outra.html')
