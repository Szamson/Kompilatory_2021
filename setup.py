from setuptools import setup, find_packages

setup(
    name="HeroLang",
    version="0.2",
    packages=['HeroLang'],
    entry_points={
        'console_scripts': [
            'HeroLang = antlr:main',
        ],
    }
)
