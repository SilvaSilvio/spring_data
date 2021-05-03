from aplicacaoapp import urls
import aplicacaoapp
from django.contrib import admin
from django.urls import path, include


urlpatterns = [
    path('', include(aplicacaoapp.urls) ),
    path('admin/', admin.site.urls),
]
